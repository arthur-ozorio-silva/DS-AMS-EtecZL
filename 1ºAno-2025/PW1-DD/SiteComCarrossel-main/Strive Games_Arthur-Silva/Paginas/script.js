const carrossel = document.getElementById("carrossel");
    const prev = document.getElementById("prevBtn");
    const next = document.getElementById("nextBtn");

    const itemWidth = 260; // largura da imagem + gap
    const totalItems = carrossel.children.length;

    next.addEventListener("click", () => {
        // avança
        carrossel.scrollLeft += itemWidth;

        // se chegar no final → volta ao início
        if (carrossel.scrollLeft + carrossel.offsetWidth >= carrossel.scrollWidth - itemWidth) {
            setTimeout(() => {
                carrossel.scrollLeft = 0;
            }, 250);
        }
    });

    prev.addEventListener("click", () => {
        // volta
        carrossel.scrollLeft -= itemWidth;

        // se chegar no início → pula para o final
        if (carrossel.scrollLeft <= 0) {
            setTimeout(() => {
                carrossel.scrollLeft = carrossel.scrollWidth;
            }, 250);
        }
    });