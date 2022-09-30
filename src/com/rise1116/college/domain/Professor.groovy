package com.rise1116.college.domain

import com.abc.salary.SalariedIndividual

class Professor extends CollegeUser implements SalariedIndividual {

    List<String> subjects

    Double costPerDay

    Integer daysWorkedInMonth

    @Override
    Integer getNoOfWorkingDays() {
        this.daysWorkedInMonth
    }

    @Override
    Double getPerDayCost() {
        this.costPerDay
    }
}
