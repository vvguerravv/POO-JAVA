````mermaid
classDiagram 
    
    class Animais{
        <<Abstract>>
        # String nome
    }
    
    class Mamiferos{
        <<Interface>>
        
        + String morder():
    }
    
    class Aves{
        <<interface>>
        
        + String bicar():
    }
    
    class Oviparo{
        <<Interface>>
        
        + String botarOvo():
    }
    
    class Voador{
        <<Interface>>
        
        + String voar():
    }
    
    class Terrestre{
        <<Interface>>
        
        +String correr():
    }
    
    class Nadador{
        <<Interface>>
        
        + String nadar(): 
    }
    
    
    class Arara{
        
    }

    class Avestruz{

    }
    
    class Baleia{

    }
    
    class Cachorro{

    }
    
    class Gato{

    }
    
    class Leao{
    }
    
    class Lobo{

    }
    
    class Macaco{

    }

    class Morcego{

    }
    
    class Pinguim{

    }
    
    class Ornitorrinco{

    }
    
    
    Animais <|-- Arara
    Animais <|-- Avestruz
    Animais <|-- Baleia
    Animais <|-- Cachorro
    Animais <|-- Gato
    Animais <|-- Leao
    Animais <|-- Lobo
    Animais <|-- Macaco
    Animais <|-- Morcego
    Animais <|-- Pinguim
    Animais <|-- Ornitorrinco
    
    Baleia ..|> Mamiferos
    Cachorro ..|> Mamiferos
    Gato ..|> Mamiferos
    Lobo ..|> Mamiferos
    Leao ..|> Mamiferos
    Morcego ..|> Mamiferos
    Ornitorrinco ..|> Mamiferos
    Macaco ..|> Mamiferos
    
    Arara ..|> Aves
    Avestruz ..|> Aves
    Pinguim ..|> Aves

    Aves --|> Oviparo
    Ornitorrinco ..|> Ornitorrinco
    
    Morcegos ..|> Voador
    Arara ..|> Voador
    
    Cachorro ..|> Terrestre
    Gato ..|> Terrestre
    Lobo ..|> Terrestre
    Leao ..|> Terrestre
    Macaco ..|> Terrestre
    Avestruz ..|> Terrestre
    Ornitorrinco ..|> Terrestre
    Pinguim ..|> Terrestre
    
    Ornitorrinco ..|> Nadador
    Pinguim ..|> Nadador
    Baleia ..|> Nadador

````