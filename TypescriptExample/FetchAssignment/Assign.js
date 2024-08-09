var Photo = /** @class */ (function () {
    function Photo(id, url) {
        this.id = id;
        this.url = url;
    }
    return Photo;
}());
var url = 'https://jsonplaceholder.typicode.com/photos';
fetch(url)
    .then(function (response) { return response.json(); })
    .then(function (data) {
    data
        .filter(function (photo) { return photo.id > 20 && photo.id < 30; })
        .forEach(function (photo) { return console.log(photo.url); });
});
