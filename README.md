# Null Util

## Maven
https://mvnrepository.com/artifact/com.github.ordnaelmedeiros/null-util
```html
<dependency>
	<groupId>com.github.ordnaelmedeiros</groupId>
	<artifactId>null-util</artifactId>
	<version>1.0.0</version>
</dependency>
```

## isNotNull
```javascript
    
    People people = new People();
    people.setAdress(null);

    // Normal validation
    String name = null;
    if (people!=null && people.getAdress()!=null && people.getAdress().getName()!=null) {
        name = people.getAdress().getName();
    }

    // Using with Try
    String name = null;
    try {
        name = people.getAdress().getName();
    } catch (NullPointerException e) {
        name = null;
    }

    // Using Null.get
    // No throw NullPointerException
    String name = Null.get(() -> people.getAdress().getName());

```

## Finally

```javascript
if (this.savedYourLife() || this.savedJustALittle()) {
	System.out.println("Help me buy more coffee?");
}
```

|USD|BRL|
|:---:|:---:|
|[![paypal](https://www.paypalobjects.com/en_US/i/btn/btn_donateCC_LG.gif)](https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=QR5L9PULKKUCN&item_name=Coffe&currency_code=USD&source=url)|[![paypal](https://www.paypalobjects.com/pt_BR/i/btn/btn_donateCC_LG.gif)](https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=QR5L9PULKKUCN&item_name=Caf%C3%A9&currency_code=BRL&source=url)|