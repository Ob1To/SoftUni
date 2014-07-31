function findYoungestPerson(persons) {
    var minAge;
    var youngestPerson=""

    for (var i in persons) {
        if (minAge===undefined){
            minAge=persons[i].age;
            youngestPerson=persons[i].firstname+" "+persons[i].lastname;
        }
        else{
            if (persons[i].age < minAge) {
                minAge = persons[i].age;
                youngestPerson = persons[i].firstname + " " + persons[i].lastname;
            }
        }
    }
    return "The youngest person is " + youngestPerson
}
var persons = [
  { firstname : 'George', lastname: 'Kolev', age: 32}, 
  { firstname : 'Bay', lastname: 'Ivan', age: 81},
  { firstname : 'Baba', lastname: 'Ginka', age: 40}]
findYoungestPerson(persons);

console.log((findYoungestPerson(persons)))