package com.rise1116.college.domain

final class Student extends CollegeUser {

    Integer roll
    Float marks

    String getDetails() {
        "Name: $name\nGender: $gender\nRoll: $roll"
    }
}
