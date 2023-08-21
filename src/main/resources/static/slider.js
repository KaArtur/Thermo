document.addEventListener("DOMContentLoaded", function() {
    const expenditureRange = document.getElementById("expenditureRange");
    const expenditureValue = document.getElementById("expenditureValue");

    // Inicjalizacja wartości pola tekstowego wartością suwaka
    expenditureValue.value = expenditureRange.value;

    // Aktualizacja wartości pola tekstowego i suwaka
    expenditureRange.addEventListener("input", function() {
        expenditureValue.value = expenditureRange.value;
    });

    // Aktualizacja wartości suwaka po wpisaniu wartości w polu tekstowym
    expenditureValue.addEventListener("input", function() {
        const newValue = Math.min(Math.max(expenditureValue.value, 40), 130);
        expenditureRange.value = newValue;
        expenditureValue.value = newValue;
    });
});