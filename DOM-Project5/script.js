var arr = [{dp:"https://images.unsplash.com/photo-1610509528015-e4c30d95a5cf?auto=format&fit=crop&q=80&w=1000&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8ZmVtYWxlJTIwbW9kZWx8ZW58MHx8MHx8fDA%3D",story:"https://assets.vogue.in/photos/5d288836e2f0130008fa5d30/2:3/w_2560%2Cc_limit/model%2520nidhi%2520sunil.jpg"},{dp:"https://images.unsplash.com/photo-1604514628550-37477afdf4e3?auto=format&fit=crop&q=80&w=327&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",story:"https://images.unsplash.com/photo-1604514649606-2fdd0399de88?auto=format&fit=crop&q=80&w=327&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"},{dp:"https://images.unsplash.com/photo-1604681630513-69474a4e253f?auto=format&fit=crop&q=80&w=327&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",story:"https://images.unsplash.com/photo-1604681527661-41ab3a47b2c4?auto=format&fit=crop&q=80&w=404&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"},{dp:"https://images.unsplash.com/photo-1604651403159-e42f29f5ea87?auto=format&fit=crop&q=80&w=387&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",story:"https://images.unsplash.com/photo-1576507169637-cdcff61eb6d5?auto=format&fit=crop&q=80&w=400&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"} 
]
var storyian =document.querySelector("#storyian")
var clutter = "";
arr.forEach(function(elem,idx){
    clutter += `<div class="story">
    <img id="${idx}" src="${elem.dp}" alt=" girl model">
</div>`;
})
document.querySelector("#storyian").innerHTML = clutter;
storyian.addEventListener("click", function(dets){
    document.querySelector("#fullScreen").style.display = "block"
    document.querySelector("#fullScreen").style.backgroundImage = `url(${arr[dets.target.id].story})`
    setTimeout(function(){
        document.querySelector("#fullScreen").style.display = "none"
    },3000)
})