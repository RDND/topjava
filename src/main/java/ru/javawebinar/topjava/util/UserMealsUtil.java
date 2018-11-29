package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.model.UserMealWithExceed;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toList;

public class UserMealsUtil {
    public static void main(String[] args) {
        List<UserMeal> mealList = Arrays.asList(
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,10,0), "Завтрак", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,13,0), "Обед", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,20,0), "Ужин", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,10,0), "Завтрак", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,13,0), "Обед", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,20,0), "Ужин", 510)
        );
        List<UserMealWithExceed> mealExceeded = getFilteredWithExceeded(mealList, LocalTime.of(7, 0),
                LocalTime.of(12, 0), 2000);
        mealExceeded.forEach(System.out::println);
    }

    public static List<UserMealWithExceed>  getFilteredWithExceeded(List<UserMeal> mealList, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {

        Map<LocalDate, Integer> caloriesSumPerDay = mealList.stream()
                .collect(Collectors.groupingBy(meal -> meal.getDateTime().toLocalDate(),
                        Collectors.summingInt(UserMeal::getCalories)));
        return mealList.stream()
                .filter(meal -> TimeUtil.isBetween(meal.getDateTime().toLocalTime(), startTime, endTime))
                .map(meal -> new UserMealWithExceed(meal.getDateTime(), meal.getDescription(), meal.getCalories(),
                        caloriesSumPerDay.get(meal.getDateTime().toLocalDate()) > caloriesPerDay))
                .collect(toList());
    }

//    public static List<UserMealWithExceed> getFilteredWithExceedInOnePass(List<UserMeal> meals, LocalTime startTime,
//                                                                          LocalTime endTime, int caloriesPerDay){
//        final class Aggregate {
//            private final List<UserMeal> dailyMeals = new ArrayList<>();
//            private int dailySumOfCalories;
//
//            private void accumulate(UserMeal meal) {
//                dailySumOfCalories += meal.getCalories();
//                if (TimeUtil.isBetween(meal.getDateTime().toLocalTime(), startTime, endTime)){
//                    dailyMeals.add(meal);
//                }
//            }
//            private Aggregate combine(Aggregate that){
//                this.dailySumOfCalories += that.dailySumOfCalories;
//                this.dailyMeals.addAll(that.dailyMeals);
//                return this;
//            }
//            private Stream<UserMealWithExceed> finisher(){
//                final boolean exceed = dailySumOfCalories > caloriesPerDay;
//                return meals.stream().map(meal -> createWithExceed(meal, exceed));
//            }
//        }
//        Collection<Stream<UserMealWithExceed>> values = meals.stream()
//                .collect(Collectors.groupingBy(UserMeal::getDate,
//                        Collector.of(Aggregate::new, Aggregate::accumulate, Aggregate::combine, Aggregate::finisher))
//                ).values();
//        return values.stream().flatMap(identity()).collect(toList());
//    }
//
//    public static UserMealWithExceed createWithExceed(UserMeal meal, boolean exceeded){
//        return new UserMealWithExceed(meal.getDateTime(), meal.getDescription(), meal.getCalories(), exceeded);
//    }
}
