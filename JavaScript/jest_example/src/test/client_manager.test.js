
const {add_client}  = require('../client_manager');
const {remove_client} = require("../client_manager");
const {consult_client}= require("../client_manager");
const {init_clients}= require("../client_manager");
const {changeAge}= require("../client_manager");


const clients = [ 
    {
        id: 117790130,
        name: 'Sebastian',
        age: 20

    },   
    {
        id: 108690481,
        name: 'Freddy',
        age: 50

    },
    {
        id: 107710499,
        name: 'Elena',
        age: 50
    }
]


beforeEach(() => {

    init_clients(clients)
})



/**
 * ADD CLIENT
 */

test('Invalid id, name and age type in add_client function should throw a error', () => {
    let client = {id: "108690481", name: 'Freddy', age: 50 }
    expect(() => add_client(client)).toThrow(Error("Invalid client"));


    client = {id: 108690481, name: 34543, age: 50 }
    expect(() => add_client(client)).toThrow(Error("Invalid client"));


    client = {id: 108690481, name: 'Freddy', age: "50" }
    expect(() => add_client(client)).toThrow(Error("Invalid client"));

 })


 test('Client added successfully', () => {

    let client = { id : 122344332, name : "Pedro", age : 35 }
    expect(() => add_client(client)).not.toThrow(Error("Invalid client"));
 })




 /**
  * REMOVE CLIENT
  */


 test('Invalid id type in remove_client function should throw a error', () => {
    const client =  { id: "117790130", name: 'Sebastian', age: 20}
    expect(() => remove_client(client.id)).toThrow(Error);
 })


 test('User not found in remove function should throw a error', () => {

    expect(() => remove_client(852584563)).toThrow(Error("User not found")); 

 })


 test('Remove client', () => {
    const result = remove_client(117790130)
    expect(result).not.toContain({ id : 117790130, name : 'Sebastian', age : 25 })  
 })


 /**
  * CONSULT CLIENT
  */


test('Invalid id type in consult_client function should throw a error', () => {
    expect(() => consult_client("108690481")).toThrow(Error("Id invalid"));
 })


test('Client not found in consult_client should throw a error', () => {

    expect(() => consult_client(785434261)).toThrow(Error("Client not found"));
 })

test("Consult client successfully", () => {

    const client = {id: 108690481, name: 'Freddy', age: 50 }

    expect(consult_client(108690481)).toEqual(client)  

    
})


/**
 * CHANGE AGE
 */


test("Invalid id and age type in changeAge function should return a error", () => {

    expect(() => changeAge("108690481", 50)).toThrow(Error("Id invalid"))
    expect(() => changeAge(108690481, "50")).toThrow(Error("Age invalid"))

})


test("Client not found in changeAge function should return a error", () => {
    expect(() => changeAge(785434261, 50)).toThrow(Error("Client not found"))
})


test("Change age successfully", () => {
    expect(changeAge(108690481, 45)).toEqual({id: 108690481, name: 'Freddy',  age: 45})
})







 
 










