const fruits = document.getElementsByClassName("fruit");

for (i = 0; i < fruits.length; ++i){
	console.log(fruits[i]);
	
	fruits[i].addEventListener('mouseover', (e) => {
		e.target.src = '/chap06/resource/image/Peach.jpg'
	});
	fruits[i].addEventListener('mouseleave', (e) => {
		e.target.src = '/chap06/resource/image/Apple.jpg'
	});
}
