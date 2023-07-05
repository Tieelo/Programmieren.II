package ProgrammierungII.functionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PackageShow {
    public static void main(String[] args) {
        List<Package> list = Arrays.asList(Package.getPackages());
        Collections.sort(list, Comparator.comparing(Package::getName));
        System.out.println(list);
    }
}
