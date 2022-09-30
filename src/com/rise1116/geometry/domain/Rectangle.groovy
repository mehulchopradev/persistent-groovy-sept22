package com.rise1116.geometry.domain

import com.abc.geometry.Shape

// Developer Z

class Rectangle extends Shape {

    Double length

    Double breadth

    @Override
    Double area() {
        this.length * this.breadth
    }

    @Override
    Double perimeter() {
        2 * (this.length + this.breadth)
    }
}
