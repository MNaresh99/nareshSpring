/*package templates;

public class Snippet {
	<?xml version="1.0" encoding="UTF-8"?>
	<configuration>
		<include
			resource="org/springframework/boot/logging/logback/defaults.xml" />
		<property name="LOG_FILE"
			value="${LOG_FILE:-${LOG_PATH:-${LOG_TEMP:-${java.io.tmpdir:-/tmp}}/}spring.log}" />
		<include
			resource="org/springframework/boot/logging/logback/file-appender.xml" />
		<root level="INFO">
			<appender-ref ref="FILE" />
		</root>
	</configuration>
}

*/