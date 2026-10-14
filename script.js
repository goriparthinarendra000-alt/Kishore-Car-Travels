// Tell the CSS that JavaScript is working
document.documentElement.classList.add("js");

// 1. Mobile menu: open and close
const toggle = document.querySelector(".menu-toggle");
const menu = document.getElementById("menu");

toggle.addEventListener("click", function () {
    menu.classList.toggle("open");
});

menu.querySelectorAll("a").forEach(function (link) {
    link.addEventListener("click", function () {
        menu.classList.remove("open");
    });
});

// 2. 3D tilt: the card turns toward the mouse
document.querySelectorAll(".tilt").forEach(function (card) {
    card.addEventListener("mousemove", function (event) {
        const box = card.getBoundingClientRect();
        const x = (event.clientX - box.left) / box.width - 0.5;
        const y = (event.clientY - box.top) / box.height - 0.5;
        card.style.transform =
            "perspective(700px) rotateY(" + x * 14 + "deg) rotateX(" + -y * 14 + "deg) scale(1.03)";
    });
    card.addEventListener("mouseleave", function () {
        card.style.transform = "";
    });
});

// 3. Vehicle cards: tap to flip on phones
document.querySelectorAll(".flip").forEach(function (card) {
    card.addEventListener("click", function () {
        if (window.matchMedia("(hover: none)").matches) {
            card.classList.toggle("flipped");
        }
    });
});

// 4. Reveal sections when they scroll into view
const items = document.querySelectorAll(".reveal");
const watcher = new IntersectionObserver(function (entries) {
    entries.forEach(function (entry) {
        if (entry.isIntersecting) {
            entry.target.classList.add("show");
            watcher.unobserve(entry.target);
        }
    });
}, { threshold: 0.15 });

items.forEach(function (item) {
    watcher.observe(item);
});