package com.rise1116.geometry.domain

import com.abc.geometry.Shape

// Developer X

class Square extends Shape {

    Double side;

    Double area() {
        this.side ** 2
    }

    Double perimeter() {
        4 * this.side
    }

    @Override
    String toString() {
        "Side=$side"
    }
}
