package com.hk.csesub;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class SemesterDataPump {
    public static LinkedHashMap<String, List<String>> getData() {
        LinkedHashMap<String, List<String>> semesterListDetails = new LinkedHashMap<String, List<String>>();

        List<String> firstSemester = new ArrayList<>();
        firstSemester.add("Computer Programming Concept");
        firstSemester.add("Electrical Device");
        firstSemester.add("Deferential and Integration Calculus");
        firstSemester.add("Physics ");

        List<String> secondSemester = new ArrayList<>();
        secondSemester.add("Electronics ");
        secondSemester.add("English");
        secondSemester.add("Structure Programming Language ");

        List<String> thirdSemester = new ArrayList<>();
        thirdSemester.add("Bangladesh Studies ");
        thirdSemester.add("DAta Structure");
        thirdSemester.add("Digital logical Design");
        thirdSemester.add("Public Speaking");

        List<String> fourthSemester = new ArrayList<>();
        fourthSemester.add("ACCOUNTING");
        fourthSemester.add("Coordinate GEOMETRY and VECTOR Analysis ");
        fourthSemester.add("Digital Electronics and pulse techniques ");
        fourthSemester.add("Object Oriented Programming");

        List<String> fiveSemester = new ArrayList<>();
        fiveSemester.add("Algorithm");
        fiveSemester.add("Computer Organization and Architecture");
        fiveSemester.add("Electronics");
        fiveSemester.add("Matrix and Differentiated calculus");

        List<String> sixSemester = new ArrayList<>();
        sixSemester.add("DBMS");
        sixSemester.add("Fourier analysis Laplace Transformation ");
        sixSemester.add("Microprocessor");
        sixSemester.add("Theory of Computing");

        List<String> sevenSemester = new ArrayList<>();
        sevenSemester.add("Advanced Programming ");
        sevenSemester.add("Artificial Intelligence");
        sevenSemester.add("Data Communication");
        sevenSemester.add("Numerical Method");

        List<String> eightSemester = new ArrayList<>();
        eightSemester.add("Computer Networking");
        eightSemester.add("Mathematical Analysis for Computer Science");
        eightSemester.add("Software Analysis and Design");
        eightSemester.add("Technical Writing");

        List<String> nineSemester = new ArrayList<>();
        nineSemester.add("Network Security ");
        nineSemester.add("Operating System");
        nineSemester.add("Software Engineering");

        List<String> tenSemester = new ArrayList<>();
        tenSemester.add("Compiler ");
        tenSemester.add("Visual and Internet Programming");

        List<String> elevenSemester = new ArrayList<>();
        elevenSemester.add("Computer Graphics");
        elevenSemester.add("Machine Learning");

        List<String> twelveSemester = new ArrayList<>();
        twelveSemester.add("Computer Peripherals");
        twelveSemester.add("Information System Management");

        semesterListDetails.put("1st Semester", firstSemester);
        semesterListDetails.put("2nd Semester", secondSemester);
        semesterListDetails.put("3rd Semester", thirdSemester);
        semesterListDetails.put("4th Semester", fourthSemester);
        semesterListDetails.put("5th Semester", fiveSemester);
        semesterListDetails.put("6th Semester", sixSemester);
        semesterListDetails.put("7th Semester", sevenSemester);
        semesterListDetails.put("8th Semester", eightSemester);
        semesterListDetails.put("9th Semester", nineSemester);
        semesterListDetails.put("10th Semester", tenSemester);
        semesterListDetails.put("11th Semester", elevenSemester);
        semesterListDetails.put("12th Semester", twelveSemester);



        return semesterListDetails;
    }
}
