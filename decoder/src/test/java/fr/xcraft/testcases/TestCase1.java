package fr.xcraft.testcases;

import fr.xcraft.Module1;
import fr.xcraft.Module2;
import fr.xcraft.Module3;
import fr.xcraft.Module4;
import fr.xcraft.Module5;
import fr.xcraft.SecretMessageDecoder;
import fr.xcraft.util.FileContent;
import fr.xcraft.util.FileContentParameterResolver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static fr.xcraft.util.StringUtil.hash;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(FileContentParameterResolver.class)
class TestCase1 {

    private String input;

    @BeforeEach
    void setUp(@FileContent("secret1.md") String fileContent) {
        input = fileContent;
    }

    @Test
    void decode_message() {
        String decodedMessage = SecretMessageDecoder.decode(input);
        String expectedHash = "dHn+pUsg1wUwIm3vmt59pS6xw38aE1E8Ug30w35H1qE=";
        assertEquals(expectedHash, hash(decodedMessage));
    }

    @Nested
    class Module1IntermediaryTests {
        @Test
        void module1_should_get_triple_backquoted_content() {
            String textInput = """
                    chose pas attendue
                    ```
                    code
                    ```
                    """;
            assertEquals("code", Module1.process(textInput));
        }
    }

    @Nested
    class IntermediaryTests {

        private String module1output;

        @BeforeEach
        void setUp() {
            module1output = Module1.process(input);
        }

        @Test 
        void module1_intermediary_output() {
            String expected = """
                    
                    """;;
            assertEquals(expected, module1output);
        }

        @Test
        void module2_intermediary_output() {
            String expected = "KBsKASEWZ3AMFG4XWCRSXT0eBnVXdWx0AXsjV2IdGhtaBiZjZWkVUnpoVGUXWhxwVGQdIXQBHm1+E3VoExA=";
            assertEquals(expected, Module2.process(module1output));
        }

        @Test
        void module3_intermediary_output() {
            String expected = "key1 -> key1 -> key2 -> key1";
            assertEquals(expected, Module3.process(module1output));
        }

        @Test
        void module3_should_transform_x_times_in_arrow() {
            assertEquals("key1 -> key1", Module3.process("key1 [x2]"));
        }
           @Test
        void module3_should_not_transform_single() {
            assertEquals("key1", Module3.process("key1"));
        }

        @Test
        void module4_intermediary_output() {

            String expected = """
                    key1
                    B08D207
                    key2
                    62734D49343156
                    """;
            assertEquals(expected, Module4.process(module1output));
        }

        @Test
        void module4_should_split_by_separator() {
            String expected = """
                    key1
                    B08D207
                    """;
            assertEquals(expected, Module4.process("key1;k0XMR0W;0x❌❌❌✅"));
        }

        @Test
        void module5_output() {
            String module2output = "KBsKASEWZ3AMFG4XWCRSXT0eBnVXdWx0AXsjV2IdGhtaBiZjZWkVUnpoVGUXWhxwVGQdIXQBHm1+E3VoExA=";
            String module3output = "key1 -> key1 -> key2 -> key1";
            String module4output = """
                    key1
                    B08D207
                    key2
                    62734D49343156
                    """;
            String expectedHash = "dHn+pUsg1wUwIm3vmt59pS6xw38aE1E8Ug30w35H1qE=";
            assertEquals(expectedHash, hash(Module5.process(module2output, module3output, module4output)));
        }

    }

}
