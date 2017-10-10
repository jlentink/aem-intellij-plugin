package co.nums.intellij.aem.htl.file

import co.nums.intellij.aem.htl.HtlLanguage
import co.nums.intellij.aem.htl.highlighter.HtlTemplateHighlighter
import co.nums.intellij.aem.htl.icons.HtlIcons
import com.intellij.openapi.fileTypes.*

object HtlFileType : LanguageFileType(HtlLanguage), TemplateLanguageFileType {

    init {
        FileTypeEditorHighlighterProviders.INSTANCE.addExplicitExtension(this) { project, _, virtualFile, editorColorsScheme ->
            HtlTemplateHighlighter(project, virtualFile, editorColorsScheme)
        }
    }

    override fun getName() = "HTL"

    override fun getDescription() = "HTML Template Language file"

    override fun getDefaultExtension() = "htl" // what about html?

    override fun getIcon() = HtlIcons.HTL_FILE

}
