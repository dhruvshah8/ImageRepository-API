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


