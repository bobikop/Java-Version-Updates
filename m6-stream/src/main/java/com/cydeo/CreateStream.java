package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {

        // Creating Stream form Array

        String[] courses = { "Java", "Spring", "Agile"};
        Stream<String> courseStream =  Arrays.stream(courses);

       //Creating Stream from Collection
        List<String> courseList = Arrays.asList("Java", "Spring", "Agile");
        Stream<String> courseStream2 = courseList.stream();


        List<Course> myCourses = Arrays.asList(
                new Course("Java", 100),
                new Course("DC",101),
                new Course("MS", 102)
    );

        //creating stream form collection
                Stream<Course> myCourseStream = myCourses.stream();

                // Creating stream Values

        Stream<Integer> stream = Stream.of(1,2,3,4,5);



    }
}
