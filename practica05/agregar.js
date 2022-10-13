function leer() {
    return document.getElementById("todo").value
    
    
}
var todo = document.getElementById("todo").value

function agregar() {
    nodo = document.createElement("li")
   // texto= document.createTextNode("hola")
    texto = document.createTextNode(leer())
    console.log(texto)
    
    nodo.appendChild(texto)
    nodo.setAttribute("id",leer())
    
    document.getElementById("lista").appendChild(nodo)
    
}

function buscar() {

        if (document.getElementById(leer())!=null){
            console.log("ya existe")

        }else{
            console.log("no existe")
        }
        
    

    
    
    


    
    
}