#if (${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

#if (${IMPORT_BLOCK} != "")${IMPORT_BLOCK}
#end
#parse("File Header.java")
/**
 * ${description}
 * @author lxp
 * @date ${YEAR}/${MONTH}/${DAY} ${HOUR}:${MINUTE}
 * @description ${description}
 * @version 1.0
 **/
#if (${VISIBILITY} == "PUBLIC")public #end public #if (${ABSTRACT} == "TRUE")abstract #end #if (${FINAL} == "TRUE")final #end class ${NAME} #if (${SUPERCLASS} != "")extends ${SUPERCLASS} #end #if (${INTERFACES} != "")implements ${INTERFACES} #end {
}
