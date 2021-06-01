<!DOCTYPE html>
<html>
    <head>
        <title>Pizza Order</title>
        <%@ include file = "partials/head.jsp" %>
    </head>
    <body>
        <h1>Order a pizza!</h1><br>
       <form action="http://localhost:8080/adlister-1.0-SNAPSHOT/pizza-order" method="POST">
        <label for ="crust">Crust</label>
        <select name="crust" id="crust">
            <option value="normal">Normal</option>
            <option value="thin">Thin</option>
            <option value="thick">Thick</option>
            <option value="stuffed">Stuffed</option>
        </select>
        <label for ="sauce">Sauce</label>
        <select name="sauce" id="sauce">
            <option value="red">Red</option>
            <option value="white">White</option>
            <option value="none">None</option>
        </select>
        <label for ="size">Size</label>
        <select name="size" id="size">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
            <option value="xl">XL</option>
        </select>
        <input type="checkbox" id="topping1" name="topping1" value="pepperoni">
        <label for="topping1">Pepperoni</label><br>
        <input type="checkbox" id="topping2" name="topping2" value="pineapple">
        <label for="topping2">Pineapple</label><br>
        <input type="checkbox" id="topping3" name="topping3" value="mushroom">
        <label for="topping3">Mushroom</label><br>
        <label for="address">Address</label>
        <input type="text">
        <button type="submit">Submit</button>
        </form>
    </body> 
</html>