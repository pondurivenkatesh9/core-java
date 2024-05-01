# Packages and Access Modifiers:

###	Packages

    Packages are nothing but folders in a project

    If I have a sample.java file in tools folder, that file will have ( package tools; )
    If another file needs to import above file ( import tools.sample; )

    Packages (dependency) names should be unique. So every company defines package with their domain (com.example.package)

    So When importing dependency, we usually see (import com.example.package.sample)

###	Access Modifiers

    Access Modifier	 	Within Class	Other Classes in Same Package	Other Classes in Different Packages
    private         		✅						❌								❌
    default					✅						✅								❌
    protected				✅						✅								✅ (only if subclass)
    public					✅						✅								✅
