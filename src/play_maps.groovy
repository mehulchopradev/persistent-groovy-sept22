def employeeMap = ['E001': 'Mehul', 'E005': 'Jane']
def emap = [:]

// insert new entry
employeeMap.put('E010', 'Jill')
employeeMap['E015'] = 'Rahul'
println employeeMap

println employeeMap.get('E005')
println employeeMap['E005']

// updating existing entry
employeeMap['E001'] = 'Roger'
println employeeMap

println employeeMap.size()
println employeeMap.keySet()
println employeeMap.values()

for (def v in employeeMap) {
    println v.getKey()
    println v.getValue()
}