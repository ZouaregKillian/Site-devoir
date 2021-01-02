
const imgSourcesDomNode = document.querySelector("#img-sources");


const imgSources = [
  "https://media4.giphy.com/media/zOvBKUUEERdNm/giphy.gif?cid=ecf05e4771f4f72c7df47b93a642922ff320d680de6b4530&rid=giphy.gif",
  "https://media4.giphy.com/media/9CffOPMLx0Hf2/giphy.gif?cid=ecf05e478523043dc18cde203bc4a910b4ea7ef0ff858fa5&rid=giphy.gif",
  "https://media4.giphy.com/media/AhjXalGPAfJg4/giphy.gif?cid=ecf05e4780b3de7a6b70e03e066a9c861a0b53fa873afe8b&rid=giphy.gif",
  "https://media0.giphy.com/media/hOzfvZynn9AK4/giphy.gif?cid=ecf05e47d304258cd4971c1ad0ba3e2c266920948cf4187f&rid=giphy.gif",
  "https://media0.giphy.com/media/13GIgrGdslD9oQ/giphy.gif?cid=ecf05e47tc3fd34pves7namwh54zuxv3f69lqvbiunkoa2nr&rid=giphy.gif",
  "https://media2.giphy.com/media/l378gxtNQaXcsqY7K/200w.webp?cid=ecf05e47cw8pwmtx2mo33w4uezpd9ylsfieolw17pp05iciz&rid=200w.webp",
  "https://media3.giphy.com/media/WZ4M8M2VbauEo/200w.webp?cid=ecf05e4730m079xexredkxwkjkzcnaxy48ai06hwcmsvjhsu&rid=200w.webp",
  "https://media1.giphy.com/media/H1dxi6xdh4NGQCZSvz/200w.webp?cid=ecf05e473o9iynemk81p9oa36tvszuv725one08brilq6zrw&rid=200w.webp",
  "https://media3.giphy.com/media/dJD0xpWqYDkic/giphy.gif?cid=ecf05e4772hent9oiqr621i7ujer9ulc5m2kn2rklv1sa9do&rid=giphy.gif",
  "https://media1.giphy.com/media/Fn1XLXZORb7H2/giphy.gif?cid=ecf05e47719f6c6a63945be85104222a7faeb5e6addc3ea3&rid=giphy.gif",
  "https://media4.giphy.com/media/VjOxTVHH9MAak/giphy.gif?cid=ecf05e478gagzw4qriddcgpykhm1c0xloht47a3ftfwxx2oc&rid=giphy.gif",
  "https://media2.giphy.com/media/l3vR8OCJPIhKSDqAU/giphy.gif?cid=ecf05e47xud3nju9z20efwm9s68bswyest41ea8dyz5o7dq1&rid=giphy.gif",
  "https://media0.giphy.com/media/KPbOPysL7XiE07HIUK/200w.webp?cid=ecf05e470rp2fqwcx0ofac8jjyk5h1tgx052ezir8ceg4tqz&rid=200w.webp",
  "https://media1.giphy.com/media/BemKqR9RDK4V2/giphy.gif?cid=ecf05e47z12yuqc004h8063kzyxqsln33dww0zw8zfups6oq&rid=giphy.gif",
  "https://media3.giphy.com/media/102h4wsmCG2s12/giphy.gif?cid=ecf05e47caade3a90f954462327546faad066119a88f8861&rid=giphy.gif",
];

let imgSourcesTemplate = "";

for(index = 0;index < imgSources.length; index ++){
  let img = imgSources[index];
  imgSourcesTemplate += `<img src="${imgSources[index]}" alt= "gif"></img>`;
}

imgSourcesDomNode.innerHTML = imgSourcesTemplate;


