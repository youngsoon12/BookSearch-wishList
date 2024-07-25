let input = document.getElementById("search-input");
let button = document.getElementById("search-btn");
let query;

input.onchange = (e) => {
    query = e.target.value;
}

const handleClick = function(e){
     window.location.href = "/searchBooks?query="+query;
}
button.addEventListener("click",handleClick);

input.addEventListener("keyup", e=>{
	if(e.keyCode === 13){
		e.preventDefault();
		button.click();
	}
})