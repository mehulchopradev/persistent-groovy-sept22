package com.abc.salary

class SalaryProcessor {

    static Double calculate(SalariedIndividual salariedIndividual) {
        def grossCost = salariedIndividual.getNoOfWorkingDays() * salariedIndividual.getPerDayCost()
        def professionalTax = 200
        def tds = (grossCost - professionalTax) * 0.1
        def netCost = grossCost - tds
    }
}
