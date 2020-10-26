const students = [
{
    nane: 'Grace',
    grade: 7
},
{
    name: 'Jennifer',
    grade: 4
},
{
    name: 'Paul',
    grade: 10
}
];
function getApprovedStudents(studentsList) {
    return studentsList.filter(students => students.grade >= 7); 
}
// lista não é alterada

console.log(`Aproved students:`);
console.log(getApprovedStudents(students));

console.log('\nList:');
console.log(students);