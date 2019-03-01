# Null Util

## Maven
https://mvnrepository.com/artifact/com.github.ordnaelmedeiros/null-util
```html
<dependency>
	<groupId>com.github.ordnaelmedeiros</groupId>
	<artifactId>null-util</artifactId>
	<version>0.0.1</version>
</dependency>
```

## isNotNull
```javascript
    
    People people = new People();
    people.setAdress(null);

    // Normal validation
    if (people!=null && people.getAdress()!=null && people.getAdress().getName()!=null) {
        System.out.println("execute");
    }

    // Using NullUtil.isNotNull
    // No throw NullPointerException
    if (isNotNull(() -> people.getAdress().getName())) {
        System.out.println("execute");
    }

```

[![paypal](https://www.paypalobjects.com/en_US/i/btn/btn_donateCC_LG.gif)](https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=QR5L9PULKKUCN&item_name=Coffe&currency_code=USD&source=url)
[![paypal](https://www.paypalobjects.com/pt_BR/i/btn/btn_donateCC_LG.gif)](https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=QR5L9PULKKUCN&item_name=Caf%C3%A9&currency_code=BRL&source=url)