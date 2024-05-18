package com.cvtheque.views;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class CenteredRowTableCellRenderer extends DefaultTableCellRenderer {
	private int rowIndexToCenter;

    public CenteredRowTableCellRenderer(int rowIndexToCenter) {
        this.rowIndexToCenter = rowIndexToCenter;
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        // Get the default renderer
        JLabel cellComponent = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Set horizontal alignment to center for all cells in the specified row
        if (row == rowIndexToCenter) {
            cellComponent.setHorizontalAlignment(SwingConstants.CENTER);
        }

        return cellComponent;
    }
}
