function leer() {
    return document.getElementById("todo").value   
}

function buscar() {
    listaTodo = document.getElementsByTagName("li")
    for (const i in listaTodo) {
        if(listaTodo[i]==leer()){
            console.log("si aparece")

        }
       
    }
    


    
    
}