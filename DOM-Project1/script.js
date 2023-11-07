var istatus = document.querySelector("h5")
var btn = document.querySelector("#add")
var check = 0;
btn.addEventListener("click",function(){
   if(check==0){ 
    istatus.innerHTML="Friends"
    istatus.style.color="green"
    check=1;
    btn.innerHTML="Remove Friend"
} else{
    istatus.innerHTML="Stranger"
    istatus.style.color="red"
    check=0;
    btn.innerHTML="Friends"
}
})

//Used for two  button system

// var removefriend = document.querySelector("#remove")
// removefriend.addEventListener("click",function(){
//     istatus.innerHTML="Stranger"
//     istatus.style.color="red"
// })
