package quiz;

public interface Translatable {
    String translate(String language);
    /*
    hvis man implementerer dette interface (implements) bliver man bedt om at udfylde metoden.
    Denne metode kan udfyldes således at, hvis vores sprog er sat til DANISH og vi kalder metoden med en engelsk string så oversætter den
    */
}
