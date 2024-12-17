//esercizio 1
class User {
    constructor(_firstName, _lastName, _age, _location) {
        this.firstName = _firstName
        this.lastName = _lastName
        this.age = _age
        this.location = _location
    }

    compare = function (y) {
        const result = this.age > y.age ? `${this.firstName} è piu vecchio/a di ${y.firstName}` : `${y.firstName} è piu vecchio/a di ${this.firstName}`
        return result          
    }
}


const createDrop = function(list, array, propName) {
    list.innerHTML = ''
    for (let i = 0; i < array.length; i++) {
        let option = document.createElement('option')
        option.innerText = array[i][propName]
        list.appendChild(option)
    }
}

let users = []
let form1 = document.forms[0]
let drop1 = document.getElementById('firstCompare')

let drop2 = document.getElementById('secondCompare')
form1.addEventListener('submit', function(e) {
    e.preventDefault()
    const userName = document.getElementById('firstName').value
    const userLastName = document.getElementById('lastName').value
    const userAge = document.getElementById('age').value
    const userLocation = document.getElementById('location').value
    const userProfile = new User (userName, userLastName, userAge, userLocation)
    users.push(userProfile)
    createDrop(drop1, users, 'firstName')
    createDrop(drop2, users, 'firstName')
    form1.reset()
})

let pResult = document.getElementById('result')
let buttonCompare = document.getElementById('compare')
buttonCompare.addEventListener('click', function () {
    let x
    let y
    pResult.innerHTML = ''
    let selected1 = drop1.selectedIndex
    let valore1 = drop1.options[selected1].text
    for (let i = 0; i < users.length; i++) {
        if (valore1 === users[i].firstName) {
            x = {...users[i]}
        }
    }
    let selected2 = drop2.selectedIndex
    let valore2 = drop2.options[selected2].text
    for (let j = 0; j < users.length; j++) {
        if (valore2 === users[j].firstName) {
            y = {...users[j]}
        }
    }
    const stringresult = x.compare(y)
    pResult.innerText = stringresult
})





//esercizio 2
class Pet {
    constructor (_petName, _ownerName, _species, _breed) {
        this.petName = _petName
        this.ownerName = _ownerName
        this.species = _species
        this.breed = _breed
    }
    sameOwner = function (y) {
        return this.ownerName === y.ownerName
    }
}


const createList = function() {
    let list = document.getElementById('tableBody')
    list.innerHTML = ''
    for (let i = 0; i < allPet.length; i++) {
        let tRow = document.createElement ('tr')
        let cells = []
        let arrayPet = []
        for (let key in allPet[i]) {
            if (typeof(allPet[i][key]) === 'string') {
                arrayPet.push(allPet[i][key])
            }            
        }        
        for (let j = 0; j < arrayPet.length; j++) {
            let cell = document.createElement('td')
            cell.innerText = arrayPet[j]
            tRow.appendChild(cell)
        }
        list.appendChild(tRow);
    }
}

let allPet = []
let form2 = document.forms[1]
let drop3 = document.getElementById('comp1')
let drop4 = document.getElementById('comp2')
form2.addEventListener('submit', function(e) {
    e.preventDefault()
    const petValue = document.getElementById('petName').value
    const petOwn = document.getElementById('ownerName').value
    const petSpecies = document.getElementById('species').value
    const petBreed = document.getElementById('breed').value
    const animal = new Pet (petValue, petOwn, petSpecies, petBreed)
    allPet.push(animal)
    createDrop(drop3, allPet, 'petName')
    createDrop(drop4, allPet, 'petName')
    createList()
    form2.reset()
})

let pResult2 = document.getElementById('result2')
let buttonCompare2 = document.getElementById('compare2')
buttonCompare2.addEventListener('click', function () {
    let w
    let z
    pResult2.innerHTML = ''
    let selected1 = drop3.selectedIndex
    let valore1 = drop3.options[selected1].text
    for (let i = 0; i < allPet.length; i++) {
        if (valore1 === allPet[i].petName) {
            w = {...allPet[i]}
        }
    }
    let selected2 = drop4.selectedIndex
    let valore2 = drop4.options[selected2].text
    for (let j = 0; j < allPet.length; j++) {
        if (valore2 === allPet[j].petName) {
            z = {...allPet[j]}
        }
    }
    const boolresult = w.sameOwner(z)
    if (boolresult) {
        pResult2.innerText = 'I due animali hanno lo stesso padrone'
    } else {
        pResult2.innerText = 'I due animali non hanno lo stesso padrone'
    }
    
})