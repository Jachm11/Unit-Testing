
let clients = []


const init_clients = (new_clients) =>{
    clients = new_clients
  
}



const add_client = (client) => {

    if (typeof(client.id) !== "number") {
        throw new Error("Id invalid");
        
    } 
    else if (typeof(client.name) !== "string"){
        throw new Error("Name invalid");
    }
    else if (typeof(client.age) !== "number"){
        throw new Error("Age invalid");

    }

 
    

}


const remove_client = (id) => {

    if(typeof(id) !== "number"){
        throw new Error("Id invalid");

    }

   
    for (let i=0; i< clients.length; i++) {
        const current_client = clients[i]
        if(current_client.id === id){
            clients.splice(i, 1);
            return clients
        }
    }

    throw new Error("User not found");
}




const consult_client = (id) => {

    if(typeof(id) !== "number"){
        throw new Error("Id invalid");
    }


    let client_found = null;

    clients.forEach(client => {

        if(client.id === id){
            client_found = client
        }
    });

    if (client_found === null) {
        throw new Error("Client not found");
    }

    return client_found;

    


}

const changeAge = (id, age) => {

    if(typeof(id) !== "number"){
        throw new Error("Id invalid");
    }

    if(typeof(age) !== "number"){
        throw new Error("Age invalid");
    }


    let client_found = null;

    clients.forEach((client) => {

        if(client.id === id) {

            client.age = age;
            client_found = client
        }
    } )

    if (client_found === null){
        throw new Error("Client not found")

    }

    return client_found;





    

}


module.exports = {add_client, remove_client, consult_client, init_clients, changeAge}