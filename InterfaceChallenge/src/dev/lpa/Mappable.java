package dev.lpa;

enum Geometry {LINE, POINT, POLYGON}

enum Color{BLACK, BLUE, GREEN, ORANGE, RED}

enum PointMarker{CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE}

enum LineMarker{DASHED, DOTTED, SOLID};

public interface Mappable {

    //%s is a specifier for a formatted string
    //because its an interface the string is public, static and final
    //because its a string and all upper case letters it is a constant. its public meaning anyone can get this value by calling mappable.JSON_PROPERTY
    String JSON_PROPERTY = """
            "properties": {%s}
            """;

    //three abstract methods and on an interface dont have to use interface modifier.methods are automactically abstract if theres no method body.
    String getLable();
    Geometry getShape();
    String getMarker();

    default String toJSON(){

        return """
                "type": "%s", "label": "%s", "marker": "%s"
                """.formatted(getShape(), getLable(), getMarker());
    }

    static void mapIt(Mappable mappable){
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));

    }

}
