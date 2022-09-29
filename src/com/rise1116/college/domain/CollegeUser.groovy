package com.rise1116.college.domain

// Object ---> CollegeUser ---> Student ---> XXXX

class CollegeUser {

    String name
    String gender

    String getDetails() {
        "Name: $name\nGender: $gender"
    }

    @Override
    String toString() {
        "$name-$gender"
    }
}
