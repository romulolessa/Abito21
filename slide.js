let time = 2000, currentImageIndex = 0,
  images = document.querySelectorAll("#slide img")
  max = images.length;
console.log(images)
function nextInterval(){
  images[currentImageIndex].classList.remove("selected")
  currentImageIndex++

  if(currentImageIndex >= max)
    currentImageIndex = 0

  images[currentImageIndex].classList.add("selected")
}
function start(){
  setInterval(()=>{
    nextInterval()
  }, time)
};
window.addEventListener("load", start);