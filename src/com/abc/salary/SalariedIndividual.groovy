package com.abc.salary

trait SalariedIndividual {
    abstract Integer getNoOfWorkingDays()

    abstract Double getPerDayCost()

    Double calculate() {
        def grossCost = this.getNoOfWorkingDays() * this.getPerDayCost()
        def professionalTax = 200
        def tds = (grossCost - professionalTax) * 0.1
        grossCost - tds
    }
}
