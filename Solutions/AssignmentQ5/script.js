const images = ["roses.jpg", "lotus.jpg", "tupid.jpg","jai.jpg","sunflower.jpg","hibiscus.jpg"]; // Add more images if needed
let currentIndex = 0;

const slider = document.getElementById("slider");
const prevBtn = document.getElementById("prevBtn");
const nextBtn = document.getElementById("nextBtn");

function updateImage() {
    slider.src = images[currentIndex];
}

prevBtn.addEventListener("click", () => {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    updateImage();
});

nextBtn.addEventListener("click", () => {
    currentIndex = (currentIndex + 1) % images.length;
    updateImage();
});
