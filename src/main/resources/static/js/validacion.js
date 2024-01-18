const formName = document.getElementById("prNombre");
const formPrice = document.getElementById("prPrecio");

function verifyInputs (element) {
    if (element.value == "" || element.value == 0 || element.value == null ){ 
        element.classList.add("border-danger");
    }else {
        element.classList.replace("border-danger","border-success");
    }
}

verifyInputs(formName);
verifyInputs(formPrice);

formName.addEventListener("input",() => {
    verifyInputs(formName);
});
formPrice.addEventListener("input", ()=>{
    verifyInputs(formPrice);
});




