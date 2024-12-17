/* ESERCIZIO 1
    Scrivi una funzione per cambiare il titolo della pagina in qualcos'altro
 */

const titolo = document.querySelector('h1');

const changeTitle = function () {
    titolo.innerText = 'MANIPULATION'
}

changeTitle();

/* ESERCIZIO 2
 Scrivi una funzione per aggiungere al titolo della pagina una classe "myHeading"
*/

const addClassToTitle = function () {
    titolo.classList.add('myHeading');
}

addClassToTitle();

/* ESERCIZIO 3
 Scrivi una funzione che cambi il testo dei p figli di un div
*/

const paragrafo = document.querySelectorAll('div p');

const changePcontent = function () {
    paragrafo.forEach(item => item.innerText = 'Testo sostituito')
}

changePcontent();

/* ESERCIZIO 4
 Scrivi una funzione che cambi la proprietà href di ogni link (tranne quello nel footer) con il valore https://www.google.com
*/

const link = document.querySelectorAll('a:not(footer a)')

const changeUrls = function () {
    link.forEach(item => {
        item.href = 'https://www.google.com'
    })
}

changeUrls();

/* ESERCIZIO 5
 Scrivi una funzione che aggiunga un nuovo elemento lista alla seconda lista non ordinata
*/

const secondaLista = document.getElementById('secondList');

const addToTheSecond = function () {
    secondaLista.innerHTML += '<li>4th</>'
}

addToTheSecond();

/* ESERCIZIO 6
 Scrivi una funzione che aggiunga un paragrafo al primo div
*/

const divp = document.querySelector('div');

const addParagraph = function () {
    divp.innerHTML += '<p>Paragrafo aggiunto con JS</p>'
}

addParagraph();

/* ESERCIZIO 7
 Scrivi una funzione che faccia scomparire la prima lista non ordinata
*/

const hidden = document.getElementById('firstList')

const hideFirstUl = function () {
    hidden.style.display = 'none';
}

hideFirstUl();

/* ESERCIZIO 8 
 Scrivi una funzione che renda verde il background di ogni lista non ordinata
*/

const green = document.querySelectorAll('ul')

const paintItGreen = function () {
    green.forEach(item => item.style.backgroundColor = 'green')
}

paintItGreen();

/* ESERCIZIO 9
 Scrivi una funzione che rimuova l'ultima lettera dall'h1 ogni volta che l'utente lo clicca
*/


const rimuoviLettera = function () {
    const title1 = document.querySelector('h1');
    title1.addEventListener("click", function () {
        title1.innerText = title1.innerText.slice(0, -1);
    });
}

rimuoviLettera();



/* ESERCIZIO 10
 Crea una funzione che, al click sul footer, riveli l'URL del link interno come contenuto di un alert()
*/

const piedipagina = document.querySelector('footer');

const revealFooterLink = function () {
    piedipagina.addEventListener('click', function () {
        alert('https://developer.mozilla.org/en-US/docs/Learn/JavaScript/Client-side_web_APIs/Manipulating_documents')
    })
}

revealFooterLink();

/* ESERCIZIO 11
 Crea una funzione che crei una tabella nell'elemento con id "tableArea". 
 La tabella avrà 5 elementi e questa struttura: immagine, nome prodotto, quantità, prezzo
*/



/* ESERCIZIO 12
 Crea una funzione che aggiunga una riga alla tabella precedentemente creata e fornisca i dati necessari come parametri
*/



/* ESERCIZIO 14
Crea una funzione che nasconda le immagini della tabella quando eseguita
*/



/* EXTRA ESERCIZIO 15
Crea una funzione che cambi il colore del h2 con id "changeMyColor" con un colore random ad ogni click ricevuto
*/

const changeColor = document.getElementById('changeMyColor');

const changeColorWithRandom = function () {
    changeColor.addEventListener('click', function () {
        const color1 = Math.floor(Math.random() * 256);
        const color2 = Math.floor(Math.random() * 256);
        const color3 = Math.floor(Math.random() * 256);
        changeColor.style.color = `rgb(${color1}, ${color2}, ${color3})`;
    });
}

changeColorWithRandom()