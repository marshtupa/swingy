package ru.school.artefacts;

public enum ArtefactType {
    ARMOR("Armor"),
    HELM("Helm"),
    WEAPON("Weapon");

    private static final ArtefactType[] ALL_VALUES = values();

    private final String name;

    ArtefactType(String name) {
        this.name = name;
    }

    public static ArtefactType getArtefact(final String name) {
        for (final ArtefactType artefactType : ALL_VALUES) {
            if (artefactType.name.equals(name))
                return artefactType;
        }
        return null;
    }
}
