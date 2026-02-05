class SuperMarket {
    public static void main(String[] args) {

        // 1. Fruits
        String[] fruits = {
            "Apple", "Banana", "Orange", "Mango", "Grapes",
            "Pineapple", "Papaya", "Watermelon", "Guava", "Pear",
            "Strawberry", "Blueberry", "Kiwi", "Pomegranate", "Plum",
            "Cherry", "Peach", "Lemon", "Lime", "Coconut",
            "Apricot", "Fig", "Raspberry", "Avocado", "Dragon Fruit"
        };

        // 2. Vegetables
        String[] vegetables = {
            "Potato", "Tomato", "Onion", "Carrot", "Cabbage",
            "Cauliflower", "Spinach", "Broccoli", "Brinjal", "Capsicum",
            "Cucumber", "Pumpkin", "Radish", "Beetroot", "Peas",
            "Beans", "Garlic", "Ginger", "Chilli", "Sweet Corn",
            "Lettuce", "Zucchini", "Mushroom", "Okra", "Turnip"
        };

        // 3. Dairy Products
        String[] dairy = {
            "Milk", "Curd", "Butter", "Cheese", "Paneer",
            "Yogurt", "Cream", "Ghee", "Flavored Milk", "Lassi",
            "Milk Powder", "Ice Cream", "Whipped Cream", "Sour Cream", "Condensed Milk",
            "Buttermilk", "Cheese Spread", "Custard", "Kefir", "Greek Yogurt",
            "Chocolate Milk", "Ricotta", "Mozzarella", "Cheddar", "Parmesan"
        };

        // 4. Bakery Items
        String[] bakery = {
            "White Bread", "Brown Bread", "Buns", "Croissant", "Donut",
            "Cake", "Pastry", "Muffin", "Cupcake", "Rusk",
            "Bagel", "Garlic Bread", "Puff", "Cookies", "Biscuits",
            "Toast", "Fruit Cake", "Brownies", "Rolls", "Sourdough",
            "Wheat Bread", "Cheese Bread", "Pizza Base", "Hot Dog Bun", "Cream Roll"
        };

        // 5. Beverages
        String[] beverages = {
            "Tea", "Coffee", "Green Tea", "Cold Coffee", "Soft Drink",
            "Orange Juice", "Apple Juice", "Lemonade", "Energy Drink", "Milkshake",
            "Iced Tea", "Mineral Water", "Soda", "Coconut Water", "Grape Juice",
            "Mango Juice", "Herbal Tea", "Hot Chocolate", "Sports Drink", "Tonic Water",
            "Strawberry Shake", "Pineapple Juice", "Cola", "Buttermilk", "Mocktail"
        };

        // 6. Snacks
        String[] snacks = {
            "Chips", "Nachos", "Popcorn", "Pretzels", "Crackers",
            "Trail Mix", "Peanuts", "Cashews", "Almonds", "Biscuits",
            "Cookies", "Granola Bar", "Energy Bar", "Puff Snacks", "Cheese Balls",
            "Corn Chips", "Bhujia", "Mixture", "Chakli", "Murukku",
            "Fruit Snacks", "Protein Bar", "Rice Cakes", "Roasted Chana", "Dry Fruits Mix"
        };

        // 7. Personal Care
        String[] personalCare = {
            "Soap", "Shampoo", "Conditioner", "Toothpaste", "Toothbrush",
            "Face Wash", "Body Wash", "Hand Wash", "Deodorant", "Perfume",
            "Hair Oil", "Hair Gel", "Face Cream", "Sunscreen", "Moisturizer",
            "Lip Balm", "Shaving Cream", "Razor", "Cotton Pads", "Wet Wipes",
            "Mouthwash", "Face Mask", "Hair Serum", "Beard Oil", "Foot Cream"
        };

        // 8. Household Cleaning
        String[] cleaning = {
            "Detergent Powder", "Liquid Detergent", "Dishwash Bar", "Dishwash Liquid", "Floor Cleaner",
            "Toilet Cleaner", "Glass Cleaner", "Phenyl", "Bleach", "Fabric Softener",
            "Air Freshener", "Room Spray", "Scrub Pad", "Cleaning Cloth", "Mop",
            "Broom", "Bucket", "Dustpan", "Hand Gloves", "Surface Cleaner",
            "Stain Remover", "Drain Cleaner", "Disinfectant Spray", "Carpet Cleaner", "Sponge"
        };

        // 9. Grains & Cereals
        String[] grains = {
            "Rice", "Wheat", "Oats", "Corn", "Barley",
            "Ragi", "Bajra", "Jowar", "Quinoa", "Millet",
            "Cornflakes", "Muesli", "Wheat Flour", "Rice Flour", "Semolina",
            "Brown Rice", "Basmati Rice", "Rolled Oats", "Cereal Mix", "Bran",
            "Buckwheat", "Pearl Millet", "Sorghum", "Amaranth", "Chia Seeds"
        };

        // 10. Pulses & Lentils
        String[] pulses = {
            "Toor Dal", "Moong Dal", "Masoor Dal", "Urad Dal", "Chana Dal",
            "Rajma", "Chickpeas", "Black Beans", "Kidney Beans", "Green Peas",
            "Soybeans", "Lentils", "Black Gram", "White Peas", "Horse Gram",
            "Pigeon Peas", "Moth Beans", "Field Beans", "Red Lentils", "Yellow Lentils",
            "Split Peas", "Adzuki Beans", "Navy Beans", "Pinto Beans", "Broad Beans"
        };

        // 11. Frozen Foods
        String[] frozen = {
            "Frozen Peas", "Frozen Corn", "Frozen Fries", "Frozen Nuggets", "Frozen Pizza",
            "Frozen Paratha", "Frozen Veg Mix", "Frozen Berries", "Frozen Fish", "Frozen Chicken",
            "Frozen Momos", "Frozen Cutlets", "Frozen Paneer", "Frozen Spring Rolls", "Frozen Bread",
            "Frozen Samosa", "Frozen Waffles", "Frozen Pancakes", "Frozen Ice Cream", "Frozen Burger Patty",
            "Frozen Spinach", "Frozen Dumplings", "Frozen Carrots", "Frozen Beans", "Frozen Meatballs"
        };

        // 12. Spices
        String[] spices = {
            "Turmeric", "Chilli Powder", "Coriander Powder", "Cumin", "Mustard Seeds",
            "Black Pepper", "Cloves", "Cardamom", "Cinnamon", "Bay Leaf",
            "Garam Masala", "Chaat Masala", "Fennel Seeds", "Fenugreek", "Star Anise",
            "Nutmeg", "Mace", "White Pepper", "Dry Ginger", "Tamarind",
            "Asafoetida", "Curry Leaves", "Saffron", "Sumac", "Paprika"
        };

        // 13. Cooking Oils
        String[] oils = {
            "Sunflower Oil", "Mustard Oil", "Groundnut Oil", "Olive Oil", "Coconut Oil",
            "Sesame Oil", "Palm Oil", "Soybean Oil", "Rice Bran Oil", "Canola Oil",
            "Corn Oil", "Avocado Oil", "Ghee", "Butter Oil", "Walnut Oil",
            "Flaxseed Oil", "Hemp Oil", "Peanut Oil", "Vegetable Oil", "Almond Oil",
            "Cottonseed Oil", "Safflower Oil", "Macadamia Oil", "Grapeseed Oil", "Hazelnut Oil"
        };

        // 14. Meat & Seafood
        String[] meat = {
            "Chicken Breast", "Chicken Wings", "Mutton", "Beef", "Pork",
            "Fish Fillet", "Prawns", "Crab", "Lobster", "Salmon",
            "Tuna", "Sardines", "Turkey", "Duck", "Bacon",
            "Sausages", "Ham", "Minced Meat", "Chicken Nuggets", "Fish Fingers",
            "Clams", "Oysters", "Shrimps", "Octopus", "Squid"
        };

        // 15. Baby Products
        String[] baby = {
            "Baby Diapers", "Baby Wipes", "Baby Lotion", "Baby Shampoo", "Baby Soap",
            "Baby Oil", "Baby Powder", "Baby Cream", "Feeding Bottle", "Pacifier",
            "Baby Food", "Baby Cereal", "Teething Toy", "Baby Blanket", "Baby Clothes",
            "Baby Socks", "Baby Bib", "Baby Towels", "Baby Nail Clipper", "Baby Monitor",
            "Baby Stroller", "Baby Carrier", "Baby Mattress", "Baby Bath Tub", "Baby Thermometer"
        };

        // 16. Stationery
        String[] stationery = {
            "Pen", "Pencil", "Eraser", "Sharpener", "Notebook",
            "Diary", "Marker", "Highlighter", "Stapler", "Staples",
            "Paper Clips", "Glue", "Scissors", "Ruler", "File Folder",
            "Sticky Notes", "Drawing Book", "Crayons", "Color Pencils", "Sketch Pens",
            "Calculator", "Whiteboard", "Duster", "Tape", "Binder"
        };

        // 17. Electronics
        String[] electronics = {
            "Mobile Phone", "Laptop", "Tablet", "Smart Watch", "Headphones",
            "Bluetooth Speaker", "Power Bank", "Charger", "USB Cable", "Earphones",
            "Camera", "Tripod", "Smart TV", "Remote Control", "Router",
            "Modem", "Printer", "Scanner", "Keyboard", "Mouse",
            "Projector", "Webcam", "Microphone", "Hard Disk", "Pendrive"
        };

        // 18. Clothing
        String[] clothing = {
            "T-Shirt", "Shirt", "Jeans", "Trousers", "Shorts",
            "Skirt", "Dress", "Sweater", "Jacket", "Hoodie",
            "Socks", "Undergarments", "Nightwear", "Blazer", "Kurta",
            "Saree", "Leggings", "Tracksuit", "Raincoat", "Scarf",
            "Cap", "Belt", "Gloves", "Shoes", "Sandals"
        };

        // 19. Kitchen Utensils
        String[] utensils = {
            "Spoon", "Fork", "Knife", "Plate", "Bowl",
            "Cup", "Mug", "Pan", "Kadhai", "Pressure Cooker",
            "Ladle", "Tongs", "Chopping Board", "Grater", "Peeler",
            "Colander", "Strainer", "Rolling Pin", "Tray", "Lunch Box",
            "Water Bottle", "Thermos", "Measuring Cups", "Measuring Spoons", "Spatula"
        };

        // 20. Pet Supplies
        String[] pets = {
            "Dog Food", "Cat Food", "Pet Shampoo", "Pet Toys", "Leash",
            "Collar", "Pet Bed", "Pet Bowl", "Pet Treats", "Pet Grooming Kit",
            "Litter Box", "Cat Litter", "Fish Food", "Bird Food", "Pet Cage",
            "Pet Carrier", "Pet Blanket", "Pet Clothes", "Pet Vitamins", "Pet Chew Toys",
            "Pet Brush", "Pet Nail Cutter", "Pet Training Pads", "Aquarium", "Pet Water Fountain"
        };

        // ---------- PRINTING USING FOR-EACH LOOPS ----------

        System.out.println("=== Fruits ===");
        for (String item : fruits) {
            System.out.println(item);
        }

        System.out.println("\n=== Vegetables ===");
        for (String item : vegetables) {
            System.out.println(item);
        }

        System.out.println("\n=== Dairy Products ===");
        for (String item : dairy) {
            System.out.println(item);
        }

        System.out.println("\n=== Bakery Items ===");
        for (String item : bakery) {
            System.out.println(item);
        }

        System.out.println("\n=== Beverages ===");
        for (String item : beverages) {
            System.out.println(item);
        }

        System.out.println("\n=== Snacks ===");
        for (String item : snacks) {
            System.out.println(item);
        }

        System.out.println("\n=== Personal Care ===");
        for (String item : personalCare) {
            System.out.println(item);
        }

        System.out.println("\n=== Household Cleaning ===");
        for (String item : cleaning) {
            System.out.println(item);
        }

        System.out.println("\n=== Grains & Cereals ===");
        for (String item : grains) {
            System.out.println(item);
        }

        System.out.println("\n=== Pulses & Lentils ===");
        for (String item : pulses) {
            System.out.println(item);
        }

        System.out.println("\n=== Frozen Foods ===");
        for (String item : frozen) {
            System.out.println(item);
        }

        System.out.println("\n=== Spices ===");
        for (String item : spices) {
            System.out.println(item);
        }

        System.out.println("\n=== Cooking Oils ===");
        for (String item : oils) {
            System.out.println(item);
        }

        System.out.println("\n=== Meat & Seafood ===");
        for (String item : meat) {
            System.out.println(item);
        }

        System.out.println("\n=== Baby Products ===");
        for (String item : baby) {
            System.out.println(item);
        }

        System.out.println("\n=== Stationery ===");
        for (String item : stationery) {
            System.out.println(item);
        }

        System.out.println("\n=== Electronics ===");
        for (String item : electronics) {
            System.out.println(item);
        }

        System.out.println("\n=== Clothing ===");
        for (String item : clothing) {
            System.out.println(item);
        }

        System.out.println("\n=== Kitchen Utensils ===");
        for (String item : utensils) {
            System.out.println(item);
        }

        System.out.println("\n=== Pet Supplies ===");
        for (String item : pets) {
            System.out.println(item);
        }
    }
}
