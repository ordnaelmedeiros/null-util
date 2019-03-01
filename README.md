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

## `If this saved your life, just a little, help me buy more coffee.`

<form action="https://www.paypal.com/cgi-bin/webscr" method="post" target="_top">
<input type="hidden" name="cmd" value="_s-xclick">
<table>
<tr><td><input type="hidden" name="on0" value="Types">Types</td></tr><tr><td><select name="os0">
	<option value="Mochaccino">Mochaccino $5,00 USD</option>
	<option value="Cappuccino">Cappuccino $10,00 USD</option>
	<option value="Espresso">Espresso $20,00 USD</option>
</select> </td></tr>
</table>
<input type="hidden" name="encrypted" value="-----BEGIN PKCS7-----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-----END PKCS7-----">
<input type="image" src="https://www.paypalobjects.com/en_US/i/btn/btn_paynowCC_LG.gif" border="0" name="submit" alt="PayPal - The safer, easier way to pay online!">
<img alt="" border="0" src="https://www.paypalobjects.com/pt_BR/i/scr/pixel.gif" width="1" height="1">
</form>




<form action="https://www.paypal.com/cgi-bin/webscr" method="post" target="_top">
<input type="hidden" name="cmd" value="_s-xclick">
<table>
<tr><td><input type="hidden" name="on0" value="Tipos">Tipos</td></tr><tr><td><select name="os0">
	<option value="Mochaccino">Mochaccino R$10,00</option>
	<option value="Cappuccino">Cappuccino R$20,00</option>
	<option value="Espresso">Espresso R$40,00</option>
</select> </td></tr>
</table>
<input type="hidden" name="encrypted" value="-----BEGIN PKCS7-----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-----END PKCS7-----">
<input type="image" src="https://www.paypalobjects.com/pt_BR/BR/i/btn/btn_paynowCC_LG.gif" border="0" name="submit" alt="PayPal - A maneira fácil e segura de enviar pagamentos online!">
<img alt="" border="0" src="https://www.paypalobjects.com/pt_BR/i/scr/pixel.gif" width="1" height="1">
</form>