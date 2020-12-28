# ImageRepository-API
A API to store images, prices, details in a hosted SQL DB. 


The API repersents one you would use to power the backend of a online store, holding prices, names of products along with images in an SQL database containing the inventory. 

### Features: 
- Add products 
- Add images 
- Image compression 
- Change inventory 
- View bulk images 
- Quick delete 

Images are processed in the database through an image compressio algorithm which converts .jpg files into byte[] arrays. As a result, this allows quicker data transfers, secure image uploads and less space in database memory.  

## How To Use: 
```
1. git clone git@github.com:dhruvshah8/ImageRepository-API.git
2. Run CrudApiApplication.Java
3. Open terminal/cmd 
```

## EndPoints: 
Here are some following examples on how to use the API endpoints. 

## POST Functions
```
curl -d '{"name":"Testing123","price":200, "quantity":3.0, "location":"Users/user/Downloads/Test1.jpg"}' -H 'Content-Type: application/json' http://localhost:9000/addProduct
```
More than one product can be uploaded using 
```
http://localhost:9000/addProducts 
```


## GET Fucntions
All products: 
```
curl http://localhost:9000/products/
```
Product bu ID: 
```
curl http://localhost:9000/productById/{1}
```

## PUT & UPDATE: 
```
curl -X PUT -H {“name":"Testing123","price":200, "quantity":3.0}' -H 'Content-Type: application/json' http://localhost:9000/addProduct

curl -X PUT -H "Content-Type: application/json" -d {“name":"Testing123","price":200, "quantity":3.0}' http://localhost:9000/update
```

