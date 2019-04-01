package se.iths.cucumber;

import java.util.Locale;

public class CucumberConfig implements TypeRegistryConfigurer {

    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineDataTableType(
                new DataTableType(
                        User.class,
                        (Map<String, String> row) -> new ObjectMapper().convertValue(row, User.class))
        );
    }
}

}
