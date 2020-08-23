var pocetnoVreme = prompt('Od kojeg vremena?');
var zavrsnoVreme = prompt('Do kojeg vremena?');
var cena = prompt('Koja je cena po satu?');
var zavrsnaCena = 0;

for(i = pocetnoVreme; i <= zavrsnoVreme; i++) {
    zavrsnaCena++;
}

console.log(zavrsnaCena);
