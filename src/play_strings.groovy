def fullName = 'mehul chopra'

println fullName.toUpperCase()
println fullName // remains the same

println fullName.size()
println fullName.isNumber()

def password = '234234'
println password.isNumber()

def message = 'good morning'
println message.replace('morning', 'night')
println message // remains the same

def greeting = 'hello to all. welcome to this event all. all  enjoy'
println greeting.count('all')
println greeting.count('good')

def studentData = '      mehul,m,10,90                   '
println studentData.trim()
println studentData

println message.contains('mor')
println message.startsWith('morning')
println message.endsWith('morning')

println message.indexOf('m')
println message.lastIndexOf('o')
println message.lastIndexOf('x')
println message.charAt(0)

// ***Good morning***
println 'Good morning'.center('Good morning'.size() + 12, '+')

println message.substring(0, 4)

// groovy operators on string object
println message[0]
println message[1]
println message[-1]
println message[-3]

println message[0..3]
println message[3..0]

def punishment = 'I will not talk in the class'
println punishment * 100

def g = 'Good morning to all'
println g - 'morning to'

def s1 = 'mehul chopra'
def fname = 'mehul'
def lname = 'chopra'
def s2 = "${fname} ${lname}"
def s3 = 'mehul chopra'

println s1.equals(s2)

println s1 == s2 // true and not false as it would in java
println s1 == s3

// comparing address in groovy
println(s1.is(s2))
println(s1.is(s3))

for(def v in punishment) {
    println v
}

def sql = """
    select name, gender roll
        from students
        where gender = 'm'
"""
println sql




