package com.example.demo.util;

import java.util.Date;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import com.example.demo.bss.domain.Article;
import com.example.demo.bss.domain.Board;
import com.example.demo.uss.domain.Admin;
import com.example.demo.uss.domain.User;

import org.springframework.stereotype.Component;

@Component
public class proxy {

    public Consumer<String> print = System.out::print;

    public Function<Object, String> string = String::valueOf;

    public Function<String, Integer> str2int = Integer::parseInt;
    // public Function<Integer, String> int2str = Integer::parseInt;

    public Function<Double, Double> absD = Math::abs;
    public Function<Float, Float> absF = Math::abs;
    public Function<Integer, Integer> absI = Math::abs;
    public Function<Long, Long> absL = Math::abs;

    public Function<Double, Double> ceil = Math::ceil;

    public Function<Double, Double> floor = Math::floor;

    public BiFunction<Double, Double, Double> maxD = Math::max;
    public BiFunction<Float, Float, Float> maxF = Math::max;
    public BiFunction<Integer, Integer, Integer> maxI = Math::max;
    public BiFunction<Long, Long, Long> maxL = Math::max;

    public BiFunction<Double, Double, Double> minD = Math::min;
    public BiFunction<Float, Float, Float> minF = Math::min;
    public BiFunction<Integer, Integer, Integer> minI = Math::min;
    public BiFunction<Long, Long, Long> minL = Math::min;

    public Supplier<Double> randomD = Math::random;
    public static BiFunction<Integer, Integer, Integer> rangeRandom = (t, u) -> (int) (Math.random() * (u - t)) + t;
    // (int)(Math.random()*(u-t)) + t ;

    public Function<Double, Double> rintD = Math::rint;

    public Function<Double, Long> roundD = Math::round;
    public Function<Float, Integer> roundF = Math::round;

    public Supplier<User> newUser = User::new;
    public Supplier<Admin> newAdmin = Admin::new;
    public Supplier<Article> newArticle = Article::new;
    public Supplier<Board> newBoard = Board::new;

    public static Supplier<Date> regdate = Date::new;

}
