// Manager


import com.abc.geometry.CalculateStatistics
import com.abc.geometry.Shape
import com.rise1116.geometry.domain.Circle
import com.rise1116.geometry.domain.Square
import com.rise1116.geometry.domain.Rectangle

def s = new Square(side: 5)
CalculateStatistics.calculate(s)

def r = new Rectangle(length: 6, breadth: 3)
CalculateStatistics.calculate(r)

def c = new Circle(radius: 6)
CalculateStatistics.calculate(c)

// new Shape() // abstract class cannot be instantiated!

// CalculateStatistics.calculate("Mehul chopra")

// println s.area()
// println s.perimeter()

// Square s = new Square()
// Rectangle r = new Rectangle()
// Square, Rectangle are subclasses of Shape
// Shape s = new Square()
// Shape r = new Rectangle()